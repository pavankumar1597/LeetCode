class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        
        
        
        String prefix = strs[0] ;//flower
        for(int i =1 ;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix =prefix.substring(0,prefix.length()-1);
                
            }
        }
        
        
        return prefix ;
        
    }
}