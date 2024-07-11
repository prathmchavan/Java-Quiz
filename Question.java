public class Question {
    private int id;
    private String question;
    private String[] opt = new String[4];
    private String answer;

    // Constructor to initialize the Question object
    public Question(int id, String question, String[] opt, String answer) {
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.answer = answer;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOpt() {
        return opt;
    }

    public void setOpt(String[] opt) {
        this.opt = opt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("id=").append(id);
        sb.append(", question=").append(question);
        sb.append(", opt=").append(opt);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }
}
