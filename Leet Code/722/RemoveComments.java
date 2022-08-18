import java.util.ArrayList;
import java.util.List;

public class RemoveComments {

    public static void main(String[] args) {
        RemoveComments rc = new RemoveComments();

        String source[] = { "a/*comment", "line", "more_comment*/b" };

        List<String> code = rc.removesComments(source);

        for (String string : code) {
            System.out.print(string + " ,");
        }
    }

    public List<String> removesComments(String[] source) {
        List<String> code = new ArrayList<>();
        boolean inCommentArea = false;
        String line = "";

        for (int i = 0; i < source.length; i++) 
        {
            String s = source[i];

            for (int j = 0; j < source[i].length(); j++) 
            {
                if (inCommentArea)
                {
                    if (s.charAt(j) == '*' && s.charAt(j + 1) == '/') 
                    {
                        inCommentArea = false;
                        j++;
                    }
                }
                else 
                {
                    if (s.charAt(j) == '/' && s.charAt(j + 1) == '/')
                        break;
                    else if (s.charAt(j) == '/' && s.charAt(j + 1) == '*')
                    {
                        inCommentArea = true;
                        j++;
                    }
                    else if (!inCommentArea) 
                    {
                        line = line + s.charAt(j);
                    }
                }
            }
            if (!line.equals("") && !inCommentArea) {
                code.add(line);
                line = "";
            }
        }
        return code;
    }
}