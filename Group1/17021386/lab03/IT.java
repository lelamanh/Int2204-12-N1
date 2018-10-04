package neon.com;

public class IT {
    private Integer years_of_experience; // năm kinh nghiệm
    private String  name; // tên người
    private String know_programming_language; // ngôn ngữ  biết

    /**
     * nConstructer không có tham số
     */
    public IT() {
    }

    /**
     * Constructer có tham số đầy đủ
     * @param years_of_experience
     * @param name
     * @param know_programming_language
     */
    public IT(Integer years_of_experience, String name, String know_programming_language) {
        this.years_of_experience = years_of_experience;
        this.name = name;
        this.know_programming_language = know_programming_language;
    }

    public Integer getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(Integer years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKnow_programming_language() {
        return know_programming_language;
    }

    public void setKnow_programming_language(String know_programming_language) {
        this.know_programming_language = know_programming_language;
    }

    /**
     * in ra
     */
    public void Print(){
        System.out.println(getKnow_programming_language());
        System.out.println(getName());
        System.out.println(getYears_of_experience());

    }
}
