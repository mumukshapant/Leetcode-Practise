class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {

        Set<String> dishSet = new HashSet<>(); 
        Map<Integer, Map<String, Integer>> tablefoodcountmap = new HashMap<>(); 
        
        //extract the food item 
        for(List<String> i :orders){
            String dish = i.get(2);
            dishSet.add(dish); 

            int tnumber= Integer.parseInt(i.get(1)); 

            tablefoodcountmap.putIfAbsent(tnumber, new HashMap<>()); 

            Map< String, Integer> foodqty = tablefoodcountmap.get(tnumber); 
            foodqty.put(dish, foodqty.getOrDefault(dish, 0)+1); 
    
        }

         List<String> foodItemsList = new ArrayList<>(dishSet);
        Collections.sort(foodItemsList);
        
        
        List<List<String>> res= new ArrayList<>(); 


         List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(foodItemsList);


        res.add(header);

        List<Integer> tableNumbers = new ArrayList<>(tablefoodcountmap.keySet());
        Collections.sort(tableNumbers);


         for (int tableNumber : tableNumbers) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(tableNumber));
            Map<String, Integer> foodqty = tablefoodcountmap.get(tableNumber);

            for (String dish : foodItemsList) {
                row.add(String.valueOf(foodqty.getOrDefault(dish, 0)));
            }
            res.add(row);
        }











        return res; 
        
    }
}