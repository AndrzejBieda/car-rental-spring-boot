-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 26 Cze 2020, 23:14
-- Wersja serwera: 10.4.11-MariaDB
-- Wersja PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `wypdb`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `car`
--

CREATE TABLE `car` (
  `id` bigint(20) NOT NULL,
  `cena` int(11) DEFAULT NULL,
  `drzwi` varchar(255) DEFAULT NULL,
  `kaucja` int(11) DEFAULT NULL,
  `klima` varchar(255) DEFAULT NULL,
  `marka` varchar(255) DEFAULT NULL,
  `miejsca` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `pakownosc` varchar(255) DEFAULT NULL,
  `paliwo` varchar(255) DEFAULT NULL,
  `skrzynia` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `car`
--

INSERT INTO `car` (`id`, `cena`, `drzwi`, `kaucja`, `klima`, `marka`, `miejsca`, `model`, `pakownosc`, `paliwo`, `skrzynia`) VALUES
(1, 100, '2 Drzwi', 400, 'Klimatyzacja', 'Fiat', '4 Miejsca', '500', '1 Torba', 'Benzyna', 'Manualna skrzynia biedów'),
(2, 120, '4 Drzwi', 450, 'Klimatyzacja', 'Toyota', '5 Miejsc', 'Yaris', '2 Torby', 'Benzyna', 'Manualna skrzynia biedów'),
(3, 130, '4 Drzwi', 500, 'Klimatyzacja', 'Volkswagen', '5 Miejsc', 'Golf', '2 Torby', 'Benzyna', 'Manualna skrzynia biedów'),
(4, 140, '4 Drzwi', 600, 'Klimatyzacja', 'Seat', '5 Miejsc', 'Leon', '2 Torby', 'Diesel', 'Automatyczna skrzynia biedów'),
(5, 150, '4 Drzwi', 700, 'Klimatyzacja', 'Mercedes-Benz', '5 Miejsc', 'A-Class', '2 Torby', 'Benzyna', 'Automatyczna skrzynia biedów'),
(6, 160, '4 Drzwi', 800, 'Klimatyzacja', 'Opel', '5 Miejsc', 'Insignia', '3 Torby', 'Benzyna', 'Manualna skrzynia biedów'),
(7, 150, '4 Drzwi', 800, 'Klimatyzacja', 'Volkswagen', '5 Miejsc', 'Passat', '3 Torby', 'Diesel', 'Automatyczna skrzynia biedów'),
(8, 160, '4 Drzwi', 800, 'Klimatyzacja', 'Toyota', '5 Miejsc', 'Avensis', '3 Torby', 'Diesel', 'Manualna skrzynia biedów'),
(9, 190, '3 Drzwi', 900, 'Klimatyzacja', 'Renault', '9 Miejsc', 'Traffic', '4 Torby', 'Benzyna', 'Automatyczna skrzynia biedów');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `place`
--

CREATE TABLE `place` (
  `id` bigint(20) NOT NULL,
  `adres` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `place`
--

INSERT INTO `place` (`id`, `adres`) VALUES
(1, 'Rzeszów, ul. Kopisto 2A'),
(2, 'Kraków, ul. Popiełuszki 46'),
(3, 'Katowice, ul. Kwiatowa 16C');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `reservation`
--

CREATE TABLE `reservation` (
  `id` bigint(20) NOT NULL,
  `data_odbioru` datetime DEFAULT NULL,
  `data_zwrotu` datetime DEFAULT NULL,
  `klient_id` bigint(20) DEFAULT NULL,
  `miejsce_odbioru_id` bigint(20) DEFAULT NULL,
  `miejsce_zwrotu_id` bigint(20) DEFAULT NULL,
  `samochod_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `reservation`
--

INSERT INTO `reservation` (`id`, `data_odbioru`, `data_zwrotu`, `klient_id`, `miejsce_odbioru_id`, `miejsce_zwrotu_id`, `samochod_id`) VALUES
(10, '2022-02-06 00:00:00', '2022-06-06 00:00:00', 1, 1, 2, 5),
(11, '2022-05-06 00:00:00', '2020-12-07 00:00:00', 1, 1, 1, 9),
(12, '2022-03-06 00:00:00', '2022-05-06 00:00:00', 1, 3, 2, 3),
(13, '2022-02-07 00:00:00', '2022-02-08 00:00:00', 1, 2, 1, 3),
(14, '2022-04-06 00:00:00', '2022-05-06 00:00:00', 4, 2, 3, 2),
(15, '2020-06-07 00:00:00', '2020-11-07 00:00:00', 4, 1, 3, 5),
(16, '2022-04-06 00:00:00', '2020-12-07 00:00:00', 4, 1, 2, 6),
(17, '2020-06-07 00:00:00', '2020-10-07 00:00:00', 4, 1, 2, 3),
(18, '2022-03-06 00:00:00', '2022-04-06 00:00:00', 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(120) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `username`) VALUES
(1, '123@abc.pl', '$2a$10$EsDUznn4q/LKu5juEfdSSO/qozeO0oGQDZzu1WHGfKfLqRxycsIGS', 'user'),
(2, '321@abc.pl', '$2a$10$hbSX5xr30cr6OZyGjIQs6ubtUzS9VObPuNeAiXrRRvBw0NKYqNt2m', 'admin'),
(4, '1234@abcd.pl', '$2a$10$8R1cgenZSvEzzuf1IOzBbOKdSASbHJe7ZjS60O3MKWZ0Y.CV44Si2', 'user1');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `user_roles`
--

CREATE TABLE `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES
(1, 1),
(2, 2),
(4, 1);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `place`
--
ALTER TABLE `place`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKevrd4u1pf6chaclhkbcj7xaru` (`klient_id`),
  ADD KEY `FKsepvbbrucuj8389rsvea0naq2` (`miejsce_odbioru_id`),
  ADD KEY `FKgeburive37ekvkuf8ljnbsc5l` (`miejsce_zwrotu_id`),
  ADD KEY `FKn9vbmbrs26f53k8mds1d6rf4w` (`samochod_id`);

--
-- Indeksy dla tabeli `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  ADD UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`);

--
-- Indeksy dla tabeli `user_roles`
--
ALTER TABLE `user_roles`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `car`
--
ALTER TABLE `car`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT dla tabeli `place`
--
ALTER TABLE `place`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT dla tabeli `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT dla tabeli `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT dla tabeli `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FKevrd4u1pf6chaclhkbcj7xaru` FOREIGN KEY (`klient_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKgeburive37ekvkuf8ljnbsc5l` FOREIGN KEY (`miejsce_zwrotu_id`) REFERENCES `place` (`id`),
  ADD CONSTRAINT `FKn9vbmbrs26f53k8mds1d6rf4w` FOREIGN KEY (`samochod_id`) REFERENCES `car` (`id`),
  ADD CONSTRAINT `FKsepvbbrucuj8389rsvea0naq2` FOREIGN KEY (`miejsce_odbioru_id`) REFERENCES `place` (`id`);

--
-- Ograniczenia dla tabeli `user_roles`
--
ALTER TABLE `user_roles`
  ADD CONSTRAINT `FKh8ciramu9cc9q3qcqiv4ue8a6` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `FKhfh9dx7w3ubf1co1vdev94g3f` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
