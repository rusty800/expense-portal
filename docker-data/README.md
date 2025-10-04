Creating docker network

docker network create shared-network-name

    version: '3.8'
    services:
      service1:
        image: your-image-1
        networks:
          - shared-network-name
    networks:
      shared-network-name:
        external: true



Mysql permissions

      CREATE USER 'your_user'@'%' IDENTIFIED BY 'your_password';
        GRANT ALL PRIVILEGES ON your_database.* TO 'your_user'@'%';
        FLUSH PRIVILEGES;

