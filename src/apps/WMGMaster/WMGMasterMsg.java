/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'WMGMasterMsg'
 * message type.
 */

public class WMGMasterMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 4;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 6;

    /** Create a new WMGMasterMsg of size 4. */
    public WMGMasterMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new WMGMasterMsg of the given data_length. */
    public WMGMasterMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new WMGMasterMsg with the given data_length
     * and base offset.
     */
    public WMGMasterMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new WMGMasterMsg using the given byte array
     * as backing store.
     */
    public WMGMasterMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new WMGMasterMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public WMGMasterMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new WMGMasterMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public WMGMasterMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new WMGMasterMsg embedded in the given message
     * at the given base offset.
     */
    public WMGMasterMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new WMGMasterMsg embedded in the given message
     * at the given base offset and length.
     */
    public WMGMasterMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <WMGMasterMsg> \n";
      try {
        s += "  [type=0x"+Long.toHexString(get_type())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [data=0x"+Long.toHexString(get_data())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: type
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'type' is signed (false).
     */
    public static boolean isSigned_type() {
        return false;
    }

    /**
     * Return whether the field 'type' is an array (false).
     */
    public static boolean isArray_type() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'type'
     */
    public static int offset_type() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'type'
     */
    public static int offsetBits_type() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'type'
     */
    public int get_type() {
        return (int)getUIntBEElement(offsetBits_type(), 16);
    }

    /**
     * Set the value of the field 'type'
     */
    public void set_type(int value) {
        setUIntBEElement(offsetBits_type(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'type'
     */
    public static int size_type() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'type'
     */
    public static int sizeBits_type() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: data
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'data' is signed (false).
     */
    public static boolean isSigned_data() {
        return false;
    }

    /**
     * Return whether the field 'data' is an array (false).
     */
    public static boolean isArray_data() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'data'
     */
    public static int offset_data() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'data'
     */
    public static int offsetBits_data() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'data'
     */
    public int get_data() {
        return (int)getUIntBEElement(offsetBits_data(), 16);
    }

    /**
     * Set the value of the field 'data'
     */
    public void set_data(int value) {
        setUIntBEElement(offsetBits_data(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'data'
     */
    public static int size_data() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'data'
     */
    public static int sizeBits_data() {
        return 16;
    }

}
