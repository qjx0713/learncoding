package indi.qjx.learnjava.designpattern.pattern.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        //�������������
        Computer computer = new Computer();
        //��ȡSD���е�����
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===============");
        //ʹ�øõ��Զ�ȡTF���е�����
        //������������
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
