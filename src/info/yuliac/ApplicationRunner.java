package info.yuliac;

import org.apache.commons.lang3.StringUtils;

public class ApplicationRunner {
    public static void main(String[] args) {

        String initialString = "abc1d2e fg3h4 i5j6k7";

        String string1 = StringUtils.substringBefore(initialString," ");
        String string2 = StringUtils.substringBetween(initialString," ");
        String string3 = StringUtils.substringAfterLast(initialString," ");

        String finalString = StringUtils.reverse(string1) + " " + StringUtils.reverse(string2) + " " + StringUtils.reverse(string3);

        System.out.println(finalString);
    }
}
