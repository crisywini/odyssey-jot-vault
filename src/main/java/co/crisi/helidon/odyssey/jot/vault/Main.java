package co.crisi.helidon.odyssey.jot.vault;

import io.helidon.microprofile.server.Server;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        var server = startServer();

        System.out.println(server.port());
    }

    public static Server startServer() {
        return Server.create().start();
    }

}
