
class Solution {

    public String encode(String[] s) {
        StringBuilder encoded = new StringBuilder();

        for (String str : s) {
            encoded.append(str.length()).append("#").append(str);
        }

        return encoded.toString();
    }

    public String[] decode(String s) {

        ArrayList<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {

            int key = i;
            while (s.charAt(key) != '#') {
                key++;
            }

            int len = Integer.parseInt(s.substring(i, key));

            int start = key + 1;
            int end = start + len;

            String word = s.substring(start, end);
            decoded.add(word);

            i = end;
        }

        return decoded.toArray(new String[0]);
    }
}
