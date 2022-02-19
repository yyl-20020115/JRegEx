package com.noc;

public class Main {
    public static void main(String[] args) {
        try {
            String regexString0 = "(ab|c)*abb";
            Regex regex0 = new Regex(regexString0);
            System.out.println(regex0);
            System.out.println(regex0.getRegex());
            System.out.println(regex0.transformNFA());
            regex0.reset();

            String regexString1 = "a*";
            Regex regex1 = new Regex(regexString1);
            System.out.println(regex1.getRegex());
            System.out.println(regex1.transformNFA());
            regex1.reset();

            String regexString2 = "ab";
            Regex regex2 = new Regex(regexString2);
            System.out.println(regex2.getRegex());
            System.out.println(regex2.transformNFA());
            regex2.reset();

            String regexString3 = "a|b";
            Regex regex3 = new Regex(regexString3);
            System.out.println(regex3.getRegex());
            System.out.println(regex3.transformNFA());
            regex3.reset();

            String regexString4 = "(a|b)*";
            Regex regex4 = new Regex(regexString4);
            System.out.println(regex4.getRegex());
            System.out.println(regex4.transformNFA());
            regex4.reset();

            String regexString5 = "1(0|1)*101";
            Regex regex5 = new Regex(regexString5);
            System.out.println(regex5.getRegex());
            System.out.println(regex5.transformNFA());
            regex5.reset();

            String regexString6 = "0*10*10*10*";
            Regex regex6 = new Regex(regexString6);
            System.out.println(regex6.getRegex());
            System.out.println(regex6.transformNFA());
            regex6.reset();

            String regexString7 = "1(1010*|1(010)*1)*0";
            Regex regex7 = new Regex(regexString7);
            System.out.println(regex7.getRegex());
            System.out.println(regex7.transformNFA());
            regex6.reset();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}