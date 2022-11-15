class money {
    int rupee, paisa;

    money() {
        rupee = 0;
        paisa = 0;
    }

    money(int r, int p) {
        rupee = r;
        paisa = p;
    }

    money add(money m) {
        money mon = new money();
        mon.paisa = paisa + m.paisa;
        mon.rupee = rupee + m.rupee + mon.paisa / 100;
        mon.paisa = (paisa + m.paisa) % 100;
        return mon;
    }

    public String toString() {
        return "Rs." + rupee + "." + paisa + "paise";
    }

}

class q5 {
    public static void main(String x[]) {
        money m1 = new money(5, 60);
        money m2 = new money(9, 80);
        money m3 = new money();
        m3 = m1.add(m2);
        System.out.println(m3.toString());
    }
}