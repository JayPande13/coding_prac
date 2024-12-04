package HackerRank;

public class RegexCheckingForIP {
    String ipCheck = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    String pattern = ipCheck + "\\." + ipCheck
            + "\\." + ipCheck
            + "\\." + ipCheck;
}
