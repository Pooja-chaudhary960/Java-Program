/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class MergeLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sorted list
        System.out.print("Size of first list: ");
        int n1 = sc.nextInt();
        System.out.print("Enter elements of first list (sorted): ");
        ListNode l1 = new ListNode(sc.nextInt());
        ListNode temp = l1;
        for (int i = 1; i < n1; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        // Input second sorted list
        System.out.print("Size of second list: ");
        int n2 = sc.nextInt();
        System.out.print("Enter elements of second list (sorted): ");
        ListNode l2 = new ListNode(sc.nextInt());
        temp = l2;
        for (int i = 1; i < n2; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        // Merge the two lists
        ListNode dummy = new ListNode(0);
        temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = (l1 != null) ? l1 : l2;

        // Print merged list
        System.out.print("Merged list: ");
        temp = dummy.next;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

