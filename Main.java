public class Main {
    public static void main(String[] args) {
        // Obtém a instância da conexão com o banco de dados
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();

        // Realiza operações com a conexão
        dbConnection.connect();

        // Fecha a conexão
        dbConnection.disconnect();
    }
}
