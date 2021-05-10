package com.wpj.exchange;

public enum Season {
    SPRING("春天", "乱花渐欲迷人眼"),
    SUMMER("夏天", "映日荷花别样红"),
    AUTUMN("秋天", "无边落木萧萧下"),
    WINTER("冬天", "北风卷地百草折");
    private final String seasonName;
    private final String seasonDesc;

    private Season(String name, String seasonDesc) {
        this.seasonName = name;
        this.seasonDesc = seasonDesc;
    }

}
