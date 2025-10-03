
public class camelCase {

	public static void main(String[] args) {

		String str1 = "I-love-java-programming";
		StringBuilder sb = new StringBuilder();

		String[] arrayOfStr = str1.split("-");
		for (int i = 0; i < arrayOfStr.length; i++) {
			if (i == 0)

				sb.append(arrayOfStr[i].toLowerCase());

			else {
				String word = arrayOfStr[i];
				word =Character.toUpperCase(word.charAt(0)) + word.substring(1); 
				sb.append(word);
			}
				
		}

		String newstr1 = sb.toString();
		System.out.println("camelcase > "+newstr1);
	}

}
