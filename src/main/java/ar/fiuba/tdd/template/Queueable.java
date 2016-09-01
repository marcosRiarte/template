public interface Queueable {
    boolean isEmpty();
    int size();
    void add(T item); //Agregar un item.
    T top(); //retornar el primer item,lanzar exception si esta vacío.
    void remove(); //remover el primer item ,lanzar exception si esta vacío.
 }
    Once you're signed in, and we've initially synchronized your repositories from GitHub, go to your profile page for open source or for your private projects.

        You'll see all the organizations you're a member of and all the repositories you have access to. The ones you have administrative access to are the ones you can enable the service hook for.

        Flip the switch to on for all repositories you'd like to enable.
