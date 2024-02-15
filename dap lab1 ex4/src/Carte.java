public class Carte
{
    private String autor;
    private String titlu;
    private int pret;

    public String getAutor() {
        return autor;
    }
    public int getPret() {
        return pret;
    }
    public String getTitlu()
    {
        return titlu;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public void setTitlu(String titlu)
    {
        this.titlu=titlu;
    }

    public void setPret(int pret)
    {
        this.pret = pret;
    }

    public Carte(String autor, String titlu, int pret)
    {
        this.titlu=titlu;
        this.autor=autor;
        this.pret=pret;
    }

    public String toString()
    {
        return autor + " " + titlu + " " + pret;
    }
}