public class DatabaseConnection {
    // Instância única da classe
    private static DatabaseConnection instance;

    // Construtor privado para evitar instanciação direta
    private DatabaseConnection() {
        // Configuração da conexão com o banco de dados
        // Pode incluir lógica para estabelecer a conexão com o banco de dados
    }

    // Método estático para obter a instância única
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Métodos para interagir com a conexão do banco de dados
    public void connect() {
        System.out.println("Conexão estabelecida com o banco de dados.");
    }

    public void disconnect() {
        System.out.println("Conexão encerrada com o banco de dados.");
    }

    // Outros métodos relacionados à interação com o banco de dados
}
