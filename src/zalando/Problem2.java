package zalando;

public class Problem2 {

	 private static String appendCategoryResult(String s, String category, long size){
			return s + category + " " + size + "b\n";
		}
		
		public static String solution(String S) {
			String[] lines = S.split("\n");
			
			long musicSize = 0; long imagesSize = 0; long moviesSize = 0; long  othersSize = 0;
			
			for(String line: lines){
				String[] words = line.split(" ");
				String filename = words[0].trim();
				String extension = filename.substring(filename.lastIndexOf(".")).trim();
				String byteSize = words[1].trim().replaceAll("[^0-9]", "");
			
				int size = Integer.valueOf(byteSize);
				if (extension.equals(".mp3")  || extension.equals(".aac") || extension.equals(".flac")){
					musicSize += size; 
				}else if (extension.equals(".jpg")  || extension.equals(".bmp") || extension.equals(".gif")){
					imagesSize += size; 
				}else if (extension.equals(".mp4")  || extension.equals(".avi") || extension.equals(".mkv")){
					moviesSize += size; 
				}else{
					othersSize += size;
				}
			}
			
			String result = "";
			
			result = appendCategoryResult(result, "music", musicSize);
			result = appendCategoryResult(result, "images", imagesSize);
		    result = appendCategoryResult(result, "movies", moviesSize);
			result = appendCategoryResult(result, "other", othersSize);
		
			
			return result.trim();
		}
}
