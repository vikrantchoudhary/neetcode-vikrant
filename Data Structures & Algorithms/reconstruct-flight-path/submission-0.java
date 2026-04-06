class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,List<String>> adjNodes = new HashMap<>();
        for (List<String> ticket : tickets) {
            adjNodes.putIfAbsent(ticket.get(0), new ArrayList<>());
        }
        tickets.sort((a,b) -> a.get(1).compareTo(b.get(1)));
        for (List<String> ticket: tickets) {
            adjNodes.get(ticket.get(0)).add(ticket.get(1));
        }
        List<String> result = new ArrayList<>();
        result.add("JFK");
        if (dfs("JFK",result,adjNodes,tickets.size()+1)) {
            return result;
        }
        return new ArrayList<>();
    }
    private boolean dfs(String src, List<String> result,Map<String,List<String>>adjNodes,int ticketLen) {
        if (result.size() == ticketLen) return true;
        if (!adjNodes.containsKey(src)) return false;
        List<String> tmp = new ArrayList<>(adjNodes.get(src));
        for (int i = 0 ; i< tmp.size(); i++) {
            String v = tmp.get(i);
            adjNodes.get(src).remove(i);
            result.add(v);
            if (dfs(v,result,adjNodes,ticketLen)) return true;
            adjNodes.get(src).add(i,v);
            result.remove(result.size() -1);
        }
        return false;

    }
}
