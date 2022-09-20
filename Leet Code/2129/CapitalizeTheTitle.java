public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String title = "LPJOJ";
        CapitalizeTheTitle obj = new CapitalizeTheTitle();
        System.out.println(obj.capitalizeTitle(title));
    }

    public String capitalizeTitle(String title) {
        // char line[] = title.toCharArray();

        char line[] = new char[title.length()];

        for (int i = 0; i < line.length; i++) {
            line[i] = title.charAt(i);
        }

        for (int i = 0; i < line.length; i++) {
            if (i + 1 < line.length && line[i + 1] == ' ') {
                if (line[i] > 64 && line[i] < 91)
                    line[i] = (char) (line[i] + 32);
                i++;
                continue;
            } else if (i + 2 < line.length && line[i + 2] == ' ') {
                for (int j = 0; j < 2; j++) {
                    if (line[i] > 64 && line[i] < 91)
                        line[i] = (char) (line[i] + 32);
                    i++;
                }
                continue;
            } else if (i + 2 == line.length || i + 1 == line.length) {
                for (int j = i; j < line.length; j++) {
                    if (line[i] > 64 && line[i] < 91)
                        line[i] = (char) (line[i] + 32);
                    i++;
                }
                continue;
            }

            else {
                if (line[i] > 96 && line[i] < 123)
                    line[i] = (char) (line[i] - 32);
                i++;

                while (i + 1 <= line.length && line[i] != ' ') {
                    if (line[i] > 64 && line[i] < 91)
                        line[i] = (char) (line[i] + 32);
                    i++;
                }
            }
        }
        title = "";

        // title = String.copyValueOf(line);

        for(int i=0 ; i < line.length ; i++)
        {
            title += line[i];
        }
        return title;
    }
}
