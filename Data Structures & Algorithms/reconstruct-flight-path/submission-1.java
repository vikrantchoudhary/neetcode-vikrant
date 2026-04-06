class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>> adjNodes = new HashMap<>();
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String desc = ticket.get(1);
            adjNodes.computeIfAbsent(src, k -> new PriorityQueue<>()).offer(desc);
        }
        /*tickets.sort((a,b) -> a.get(1).compareTo(b.get(1)));
        for (List<String> ticket: tickets) {
            adjNodes.get(ticket.get(0)).add(ticket.get(1));
        }*/
        List<String> result = new ArrayList<>();
        dfs("JFK",result,adjNodes);
        Collections.reverse(result);
        return result;
    }
    private void dfs(String src, List<String> result, Map<String,PriorityQueue<String>> adjNodes) {
        PriorityQueue<String> queue = adjNodes.get(src);
        while (queue != null && !queue.isEmpty()) {
            String dest = queue.poll();
            dfs(dest,result,adjNodes);
        }
        result.add(src);
    }
}
