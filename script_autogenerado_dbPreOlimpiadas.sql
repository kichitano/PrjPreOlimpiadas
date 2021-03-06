USE [master]
GO
/****** Object:  Database [dbPreOlimpiada]    Script Date: 23/05/2018 18:31:12 ******/
CREATE DATABASE [dbPreOlimpiada]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dbPreOlimpiada', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\dbPreOlimpiada.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'dbPreOlimpiada_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\dbPreOlimpiada_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [dbPreOlimpiada] SET COMPATIBILITY_LEVEL = 130
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dbPreOlimpiada].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dbPreOlimpiada] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET ARITHABORT OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dbPreOlimpiada] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dbPreOlimpiada] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET  ENABLE_BROKER 
GO
ALTER DATABASE [dbPreOlimpiada] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dbPreOlimpiada] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET RECOVERY FULL 
GO
ALTER DATABASE [dbPreOlimpiada] SET  MULTI_USER 
GO
ALTER DATABASE [dbPreOlimpiada] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dbPreOlimpiada] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dbPreOlimpiada] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dbPreOlimpiada] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [dbPreOlimpiada] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'dbPreOlimpiada', N'ON'
GO
ALTER DATABASE [dbPreOlimpiada] SET QUERY_STORE = OFF
GO
USE [dbPreOlimpiada]
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [dbPreOlimpiada]
GO
/****** Object:  User [edu]    Script Date: 23/05/2018 18:31:12 ******/
CREATE USER [edu] WITHOUT LOGIN WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[tbAnio]    Script Date: 23/05/2018 18:31:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbAnio](
	[idAnio] [int] IDENTITY(1,1) NOT NULL,
	[descripcionAnio] [varchar](100) NULL,
	[idSerie] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[idAnio] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbApoderado]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbApoderado](
	[idApoderado] [int] IDENTITY(1,1) NOT NULL,
	[idAnio] [int] NULL,
	[idDisciplina] [int] NULL,
	[dni] [varchar](8) NOT NULL,
	[apePaterno] [varchar](100) NULL,
	[apeMaterno] [varchar](100) NULL,
	[nombres] [varchar](100) NULL,
	[estado] [char](1) NULL,
	[idEquipo] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[idApoderado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbDelegado]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbDelegado](
	[idDelegado] [int] IDENTITY(1,1) NOT NULL,
	[idApoderado] [int] NULL,
	[descripcionDelegado] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[idDelegado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbDisciplina]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbDisciplina](
	[idDisciplina] [int] IDENTITY(1,1) NOT NULL,
	[descripcionDisciplina] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[idDisciplina] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbEquipo]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbEquipo](
	[idEquipo] [int] IDENTITY(1,1) NOT NULL,
	[nroEquipo] [int] NULL,
	[nombreEquipo] [varchar](100) NULL,
	[detalleEquipo] [varchar](200) NULL,
	[estadoEquipo] [char](1) NULL,
PRIMARY KEY CLUSTERED 
(
	[idEquipo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbPartidoTenisMesa]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbPartidoTenisMesa](
	[idPartidoTenisMesa] [int] IDENTITY(1,1) NOT NULL,
	[idApoderado] [int] NULL,
	[idEquipoLocal] [int] NULL,
	[idEquipoVisitante] [int] NULL,
	[ronda] [int] NULL,
	[estadoPartido] [char](1) NULL,
PRIMARY KEY CLUSTERED 
(
	[idPartidoTenisMesa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbSerie]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbSerie](
	[idSerie] [int] IDENTITY(1,1) NOT NULL,
	[descripcionSerie] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[idSerie] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbSetPartidoTenisMesa]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbSetPartidoTenisMesa](
	[idSetPartido] [int] IDENTITY(1,1) NOT NULL,
	[idPartidoTenisMesa] [int] NULL,
	[numeroSet] [int] NULL,
	[PuntajeLocalSet] [int] NULL,
	[PuntajeVisitanteSet] [int] NULL,
	[Ganador] [char](1) NULL,
PRIMARY KEY CLUSTERED 
(
	[idSetPartido] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbUsuario]    Script Date: 23/05/2018 18:31:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbUsuario](
	[idUsuario] [int] IDENTITY(1,1) NOT NULL,
	[idApoderado] [int] NULL,
	[nombUsuario] [varchar](100) NULL,
	[passUsuario] [varchar](6) NULL,
	[estadoUsuario] [char](1) NULL,
PRIMARY KEY CLUSTERED 
(
	[idUsuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[tbAnio]  WITH CHECK ADD FOREIGN KEY([idSerie])
REFERENCES [dbo].[tbSerie] ([idSerie])
GO
ALTER TABLE [dbo].[tbApoderado]  WITH CHECK ADD FOREIGN KEY([idAnio])
REFERENCES [dbo].[tbAnio] ([idAnio])
GO
ALTER TABLE [dbo].[tbApoderado]  WITH CHECK ADD FOREIGN KEY([idDisciplina])
REFERENCES [dbo].[tbDisciplina] ([idDisciplina])
GO
ALTER TABLE [dbo].[tbApoderado]  WITH CHECK ADD FOREIGN KEY([idEquipo])
REFERENCES [dbo].[tbEquipo] ([idEquipo])
GO
ALTER TABLE [dbo].[tbDelegado]  WITH CHECK ADD FOREIGN KEY([idApoderado])
REFERENCES [dbo].[tbApoderado] ([idApoderado])
GO
ALTER TABLE [dbo].[tbPartidoTenisMesa]  WITH CHECK ADD FOREIGN KEY([idApoderado])
REFERENCES [dbo].[tbApoderado] ([idApoderado])
GO
ALTER TABLE [dbo].[tbPartidoTenisMesa]  WITH CHECK ADD FOREIGN KEY([idEquipoLocal])
REFERENCES [dbo].[tbEquipo] ([idEquipo])
GO
ALTER TABLE [dbo].[tbPartidoTenisMesa]  WITH CHECK ADD FOREIGN KEY([idEquipoVisitante])
REFERENCES [dbo].[tbEquipo] ([idEquipo])
GO
ALTER TABLE [dbo].[tbSetPartidoTenisMesa]  WITH CHECK ADD FOREIGN KEY([idPartidoTenisMesa])
REFERENCES [dbo].[tbPartidoTenisMesa] ([idPartidoTenisMesa])
GO
ALTER TABLE [dbo].[tbUsuario]  WITH CHECK ADD FOREIGN KEY([idApoderado])
REFERENCES [dbo].[tbApoderado] ([idApoderado])
GO
USE [master]
GO
ALTER DATABASE [dbPreOlimpiada] SET  READ_WRITE 
GO
