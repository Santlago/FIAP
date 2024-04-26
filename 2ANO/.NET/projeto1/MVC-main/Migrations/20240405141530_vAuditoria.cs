using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _2TDSPK.Migrations
{
    /// <inheritdoc />
    public partial class vAuditoria : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<DateTime>(
                name: "DataAlteracao",
                table: "2TDSPK_Tb_Cursos",
                type: "TIMESTAMP(7)",
                nullable: false,
                defaultValue: new DateTime(1, 1, 1, 0, 0, 0, 0, DateTimeKind.Unspecified));

            migrationBuilder.AddColumn<DateTime>(
                name: "DataCriacao",
                table: "2TDSPK_Tb_Cursos",
                type: "TIMESTAMP(7)",
                nullable: false,
                defaultValue: new DateTime(1, 1, 1, 0, 0, 0, 0, DateTimeKind.Unspecified));

            migrationBuilder.AddColumn<bool>(
                name: "Status",
                table: "2TDSPK_Tb_Cursos",
                type: "NUMBER(1)",
                nullable: false,
                defaultValue: false);

            migrationBuilder.AddColumn<string>(
                name: "UsuarioAlteracao",
                table: "2TDSPK_Tb_Cursos",
                type: "NVARCHAR2(2000)",
                nullable: false,
                defaultValue: "");

            migrationBuilder.AddColumn<string>(
                name: "UsuarioCriacao",
                table: "2TDSPK_Tb_Cursos",
                type: "NVARCHAR2(2000)",
                nullable: false,
                defaultValue: "");

            migrationBuilder.AddColumn<DateTime>(
                name: "DataAlteracao",
                table: "2TDSPK_Tb_Alunos",
                type: "TIMESTAMP(7)",
                nullable: false,
                defaultValue: new DateTime(1, 1, 1, 0, 0, 0, 0, DateTimeKind.Unspecified));

            migrationBuilder.AddColumn<DateTime>(
                name: "DataCriacao",
                table: "2TDSPK_Tb_Alunos",
                type: "TIMESTAMP(7)",
                nullable: false,
                defaultValue: new DateTime(1, 1, 1, 0, 0, 0, 0, DateTimeKind.Unspecified));

            migrationBuilder.AddColumn<bool>(
                name: "Status",
                table: "2TDSPK_Tb_Alunos",
                type: "NUMBER(1)",
                nullable: false,
                defaultValue: false);

            migrationBuilder.AddColumn<string>(
                name: "UsuarioAlteracao",
                table: "2TDSPK_Tb_Alunos",
                type: "NVARCHAR2(2000)",
                nullable: false,
                defaultValue: "");

            migrationBuilder.AddColumn<string>(
                name: "UsuarioCriacao",
                table: "2TDSPK_Tb_Alunos",
                type: "NVARCHAR2(2000)",
                nullable: false,
                defaultValue: "");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "DataAlteracao",
                table: "2TDSPK_Tb_Cursos");

            migrationBuilder.DropColumn(
                name: "DataCriacao",
                table: "2TDSPK_Tb_Cursos");

            migrationBuilder.DropColumn(
                name: "Status",
                table: "2TDSPK_Tb_Cursos");

            migrationBuilder.DropColumn(
                name: "UsuarioAlteracao",
                table: "2TDSPK_Tb_Cursos");

            migrationBuilder.DropColumn(
                name: "UsuarioCriacao",
                table: "2TDSPK_Tb_Cursos");

            migrationBuilder.DropColumn(
                name: "DataAlteracao",
                table: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropColumn(
                name: "DataCriacao",
                table: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropColumn(
                name: "Status",
                table: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropColumn(
                name: "UsuarioAlteracao",
                table: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropColumn(
                name: "UsuarioCriacao",
                table: "2TDSPK_Tb_Alunos");
        }
    }
}
