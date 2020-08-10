class PlayerStatic {

    private String name;

    static int countPlayer = 0;

    public PlayerStatic(String n) {
        name = n;
        countPlayer++;
    }

}
