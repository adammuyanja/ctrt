public final class MedicalConstants {
    public static final double NORMAL_BODY_TEMP = 36.5;
}

// This class cannot be extended due to 'final'
Example of finally block (file handling):
java
CopyEdit
try {
    // file operations
} catch (IOException e) {
    e.printStackTrace();
} finally {
    // this block always runs to close file
    fileReader.close();
}

