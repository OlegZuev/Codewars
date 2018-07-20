/**
 * We need you to implement a method of receiving commands over a network, processing the information and responding.
 *
 * Our device will send a single packet to you containing data and an instruction which you must perform before returning your reply.
 *
 * To keep things simple, we will be passing a single "packet" as a string. Each "byte" contained in the packet is represented by 4 chars.
 *
 * One packet is structured as below:
 *
 * Header  Instruction   Data1    Data2   Footer
 * ------   ------       ------   ------  ------
 *  H1H1     0F12         0012     0008    F4F4
 * ------   ------       ------   ------  ------
 *
 * The string received in this case would be - "H1H10F1200120008F4F4"
 *
 * Instruction: The calculation you should perform, always one of the below.
 *             0F12 = Addition
 *             B7A2 = Subtraction
 *             C3D9 = Multiplication
 *             FFFF = This instruction code should be used to identify your return value.
 * The Header and Footer are unique identifiers which you must use to form your reply.
 *
 * Data1 and Data2 are the decimal representation of the data you should apply your instruction to. i.e 0109 = 109.
 *
 * Your response must include the received header/footer, a "FFFF" instruction code, and the result of your calculation stored in Data1.
 *
 * Data2 should be zero'd out to "0000".
 *
 * To give a complete example:
 *
 * If you receive message "H1H10F1200120008F4F4".
 * The correct response would be "H1H1FFFF00200000F4F4"
 * In the event that your calculation produces a negative result, the value returned should be "0000", similarily if the value is above 9999 you should return "9999".
 *
 * Goodluck, I look forward to reading your creative solutions!
 */

public class StringPacket {
    public static String communicationModule(String packet) {
        String head = packet.substring(0, 4);
        String instruction = packet.substring(4, 8);
        String data1 = packet.substring(8, 12);
        String data2 = packet.substring(12, 16);
        String footer = packet.substring(16, 20);
        switch (instruction) {
            case "0F12":
                packet = head + "FFFF" + String.format("%04d", Integer.valueOf(data1) + Integer.valueOf(data2))
                        + "0000" + footer;
                break;
            case "B7A2":
                packet = head + "FFFF" + String.format("%04d", Integer.valueOf(data1) - Integer.valueOf(data2))
                        + "0000" + footer;
                break;
            case "C3D9":
                packet = head + "FFFF" + String.format("%04d", Integer.valueOf(data1) * Integer.valueOf(data2))
                        + "0000" + footer;
        }
        if (Integer.valueOf(packet.substring(8, packet.split("0000" + footer.charAt(0))[0].length())) > 9999) {
            packet = head + "FFFF99990000" + footer;
        } else if (Integer.valueOf(packet.substring(8, packet.split("0000" + footer.charAt(0))[0].length())) < 0) {
            packet = head + "FFFF00000000" + footer;
        }
        return packet;
    }
}
