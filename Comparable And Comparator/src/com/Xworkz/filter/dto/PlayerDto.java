package com.Xworkz.filter.dto;



public class PlayerDto implements Comparable<PlayerDto> {

    private int jerseyNo;
    private String name;
    private int score;

    public PlayerDto(int jerseyNo, String name, int score) {
        this.jerseyNo = jerseyNo;
        this.name = name;
        this.score = score;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(PlayerDto o) {

        int cmp = Integer.compare(o.score, this.score);

        if (cmp != 0) {
            return cmp;
        }

        cmp = this.name.compareTo(o.name);

        if (cmp != 0) {
            return cmp;
        }

        return Integer.compare(this.jerseyNo, o.jerseyNo);
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "jerseyNo=" + jerseyNo +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
