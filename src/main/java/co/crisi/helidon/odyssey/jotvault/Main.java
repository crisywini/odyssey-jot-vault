package co.crisi.helidon.odyssey.jotvault;

import io.helidon.microprofile.server.Server;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        var server = startServer();
        System.out.println(server.port());
    }

    private static Server startServer() {
        return Server.create().start();
    }
}
