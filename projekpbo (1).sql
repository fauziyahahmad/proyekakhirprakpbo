-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Bulan Mei 2020 pada 04.24
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projekpbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `laundry`
--

CREATE TABLE `laundry` (
  `id` int(10) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `berat` varchar(255) NOT NULL,
  `harga` varchar(255) NOT NULL,
  `tgl_masuk` varchar(255) NOT NULL,
  `tgl_estimasi` varchar(255) NOT NULL,
  `tgl_ambil` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `laundry`
--

INSERT INTO `laundry` (`id`, `nama`, `berat`, `harga`, `tgl_masuk`, `tgl_estimasi`, `tgl_ambil`, `status`) VALUES
(6, 'anjar', '4', '20000', '21-11-2020', '24-11-2020', '23-11-2020', 'Completed'),
(8, 'ina', '9', '45000', '19-05-2020', '22-05-2020', '23-05-2020', 'Completed'),
(12, 'husna', '10', '50000', '20-05-2020', '23-05-2020', '24-05-2020', 'Completed'),
(13, 'emir', '7', '35000', '20-05-2020', '23-05-2020', '24-05-2020', 'Completed'),
(15, 'farah', '5', '25000', '20-05-2020', '24-05-2020', '26-05-2020', 'Completed'),
(17, 'rizka', '9', '45000', '20-05-2020', '23-05-2020', '45-05-2020', 'Completed');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `laundry`
--
ALTER TABLE `laundry`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `laundry`
--
ALTER TABLE `laundry`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
