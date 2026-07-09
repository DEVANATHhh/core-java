package com.Xworkz.filter.dto;



public class SoftwareVersion implements Comparable<SoftwareVersion> {

    private int major;
    private int minor;
    private int build;

    public SoftwareVersion(int major, int minor, int build) {
        this.major = major;
        this.minor = minor;
        this.build = build;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int getBuild() {
        return build;
    }

    @Override
    public int compareTo(SoftwareVersion o) {

        int cmp = Integer.compare(this.major, o.major);

        if (cmp != 0) {
            return cmp;
        }

        cmp = Integer.compare(this.minor, o.minor);

        if (cmp != 0) {
            return cmp;
        }

        return Integer.compare(this.build, o.build);
    }

    @Override
    public String toString() {
        return "SoftwareVersion{" +
                "major=" + major +
                ", minor=" + minor +
                ", build=" + build +
                '}';
    }
}