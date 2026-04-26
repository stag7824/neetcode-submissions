class Solution {

    public String encode(List<String> strs) {
        // System.out.println("sad" + strs.toString());
        StringBuffer encodedString = new StringBuffer();
        for(String str: strs){
            // System.out.println(str);
            int length = str.length();
            encodedString.append(length).append("#").
                append(str);
        }
        System.out.println("endoded : " + encodedString.toString());
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        System.out.println("str + "+ str);
        // Striping and forming array 
        int start = 0, numIndex = 0;
        List<String> result = new ArrayList<>();
        while(start < str.length()){

            int numericalEnd = start;
            while(str.charAt(numericalEnd) != '#'){
                numericalEnd++;
            }
            // 0 - 1
            int length = Integer.parseInt(str.substring(start, numericalEnd));
            System.out.println("length : "+ length);
            result.add(str.substring(numericalEnd+1, numericalEnd + length +1));
            start = numericalEnd + length + 1;
            // result.add(str.substring());
        }
        // String[] strArray = str.replaceAll("[\\[\\]]","").split("\\s*,\\s*");
        // List<String> temp = new ArrayList<>();
        // for(String strArr: strArray){
        //     temp.add(strArr);
        // }
        // return temp;
        return result;
    }
}
