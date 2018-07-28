public class AppHorario{
    public static void main(String args[]){
        Horario horario1 = new Horario(8,20);
        Horario horario2 = new Horario(10,30);
        horario2.setHora(22);
        horario1.setMinuto(30);
        horario2.setMinuto(horario2.getMinuto() + 2);
        System.out.println(horario1);
        System.out.println(horario2);
    }
}