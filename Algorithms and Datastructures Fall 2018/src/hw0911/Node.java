//Drew Williams
//hw0911
//https://github.com/Drew-Williams/Algorithms-and-Datastructures-Fall-2018/blob/master/hw0906
//COSC 311

package hw0911;

import java.util.Scanner;

class Node {

    Node link = null;
    //int data = 0;
    double data = 0.0;

    public Node() {
        link = null;
        //data = 0;
        data = 0.0;
    }

    public Node(double data, Node link) {
        this.data = data;
        this.link = null;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

}