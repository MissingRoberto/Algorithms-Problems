package arrays;

public class URLify {
	
	public static void convert(char[] url, int lenght){
		int counter = 0;
		for(int i=lenght-1; i>0; i--){
			if (url[i]==' '){
				counter++;
			}
		}
		for(int i=lenght-1; i>0 && counter > 0; i--){
			if (url[i] == ' '){
				url[i+counter*2]='0';
				url[i+counter*2 - 1]='2';
				url[i+counter*2 - 2]='%';
				counter--;
			}else{
				url[i+counter*2]=url[i];
				url[i]=' ';
			}
		}
		
	}
}
