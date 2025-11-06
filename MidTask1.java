public class MidTask1 {
    public static void main(String[] args) {
        String firstName = "Lamia";
        String lastName = "Elma";
        String fullname = firstName + " " + lastName;
        System.out.println("Fullname:" + fullname);
        String productName = "CAMERA";
        int productId = 76812;
        String productCode = productName + "-" + productId;
        System.out.println("ProductCode:" + productCode);
        String emailAddress = "lamiaelma@gmail.com";
        String[] parts = emailAddress.split("@");
        String username = parts[0];
        System.out.println("Username:" + username);
        String message = "I Love java";
        int charCount = message.length();
        String[] words = message.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("CharacterCount=" + charCount);
        System.out.println("WordCount:" + wordCount);
        String mixedCaseSentence = "tHIs iS a CAt";
        String upperCase = mixedCaseSentence.toUpperCase();
        String lowerCase = mixedCaseSentence.toLowerCase();
        System.out.println("Upeercase:" + upperCase);
        System.out.println("LOwercse:" + lowerCase);
        String originalSentence = "I eat rice.";
        String newSentence = originalSentence.replace("rice", "soup");
        System.out.println("original:" + originalSentence);
        System.out.println("New Sentence:" + newSentence);
    }

}