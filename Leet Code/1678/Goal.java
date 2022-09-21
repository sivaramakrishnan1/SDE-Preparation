public class Goal {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        Goal g = new Goal();
        System.out.println(g.interpret(command));
    }

    public String interpret(String command) {
        String ans = "";
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                ans += command.charAt(i);
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += 'o';
                i += 2;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                ans += "al";
                i += 3;
            } else
                i++;
        }
        return ans;
    }
}