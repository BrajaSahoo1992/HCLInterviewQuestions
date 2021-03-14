
public class test1 {
	public static void main(String[] args) {
		String input="This is beautiful and this is awesome";
		String match="this";
		StringBuilder build= new StringBuilder();
		for(int i=match.length()-1;i>=0;i--) {
			build.append(match.charAt(i));
			
		}
		
		String[] arr=input.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase(match)) {
				count++;
				if(count %2==0) {
			arr[i]=build.toString();
				}
			}
		}
		StringBuilder build1= new StringBuilder();
	    for(String s:arr) {
	    	build1.append(s);
	    	build1.append(" ");
	    }
		System.out.println("Rev sentence"+build1.toString());
	}

}
