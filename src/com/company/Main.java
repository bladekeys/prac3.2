package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human(80, 189);
        System.out.println(human);
        Human.Hand hand = new Human.Hand(10);
        System.out.println(hand);
        Human.Leg leg = new Human.Leg(80);
        System.out.println(leg);
        Human.Head head = new Human.Head("black");
        System.out.println(head);
    }
}
