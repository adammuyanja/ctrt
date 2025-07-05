public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("medical_log.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(medicalLogFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

