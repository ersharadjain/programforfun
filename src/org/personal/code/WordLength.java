package org.personal.code;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordLength {
public static void main(String[] args){
String s = "A person can't walk in this street";
String op = "";
Scanner in = new Scanner(s);
while(in.hasNext()){
String token = in.next();
Pattern p = Pattern.compile("\\W");
Matcher m = p.matcher(token);
int count = 0;
while(m.find()){
count++;
}
int trueLength = token.length() - count;

if(trueLength >= 4 && trueLength % 2 ==0){
String t1 = token.substring(0,trueLength / 2);
String t2 = token.substring(trueLength /2);
op += t1.concat(" ").concat(t2).concat(" ");
}
else{
op += token.concat(" ");
}
}
System.out.println(op);
}
}