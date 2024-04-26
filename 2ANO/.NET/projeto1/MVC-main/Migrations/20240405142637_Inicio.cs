using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _2TDSPK.Migrations
{
    /// <inheritdoc />
    public partial class Inicio : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "2TDSPK_Tb_Alunos",
                columns: table => new
                {
                    AlunoId = table.Column<int>(type: "NUMBER(10)", nullable: false)
                        .Annotation("Oracle:Identity", "START WITH 1 INCREMENT BY 1"),
                    Nome = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    Email = table.Column<string>(type: "varchar(255)", nullable: false),
                    CPF = table.Column<string>(type: "NVARCHAR2(11)", maxLength: 11, nullable: false),
                    Semestre = table.Column<int>(type: "NUMBER(10)", nullable: false),
                    Status = table.Column<bool>(type: "NUMBER(1)", nullable: false),
                    UsuarioCriacao = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    DataCriacao = table.Column<DateTime>(type: "TIMESTAMP(7)", nullable: false),
                    UsuarioAlteracao = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    DataAlteracao = table.Column<DateTime>(type: "TIMESTAMP(7)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_2TDSPK_Tb_Alunos", x => x.AlunoId);
                });

            migrationBuilder.CreateTable(
                name: "2TDSPK_Tb_Cursos",
                columns: table => new
                {
                    CursoId = table.Column<int>(type: "NUMBER(10)", nullable: false)
                        .Annotation("Oracle:Identity", "START WITH 1 INCREMENT BY 1"),
                    Nome = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    Status = table.Column<bool>(type: "NUMBER(1)", nullable: false),
                    UsuarioCriacao = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    DataCriacao = table.Column<DateTime>(type: "TIMESTAMP(7)", nullable: false),
                    UsuarioAlteracao = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    DataAlteracao = table.Column<DateTime>(type: "TIMESTAMP(7)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_2TDSPK_Tb_Cursos", x => x.CursoId);
                });

            migrationBuilder.CreateTable(
                name: "2TDSPK_Tb_Materias",
                columns: table => new
                {
                    MateriaId = table.Column<int>(type: "NUMBER(10)", nullable: false)
                        .Annotation("Oracle:Identity", "START WITH 1 INCREMENT BY 1"),
                    Nome = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    CursoId = table.Column<int>(type: "NUMBER(10)", nullable: false),
                    Status = table.Column<bool>(type: "NUMBER(1)", nullable: false),
                    UsuarioCriacao = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    DataCriacao = table.Column<DateTime>(type: "TIMESTAMP(7)", nullable: false),
                    UsuarioAlteracao = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    DataAlteracao = table.Column<DateTime>(type: "TIMESTAMP(7)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_2TDSPK_Tb_Materias", x => x.MateriaId);
                    table.ForeignKey(
                        name: "FK_2TDSPK_Tb_Materias_2TDSPK_Tb_Cursos_CursoId",
                        column: x => x.CursoId,
                        principalTable: "2TDSPK_Tb_Cursos",
                        principalColumn: "CursoId",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_2TDSPK_Tb_Materias_CursoId",
                table: "2TDSPK_Tb_Materias",
                column: "CursoId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropTable(
                name: "2TDSPK_Tb_Materias");

            migrationBuilder.DropTable(
                name: "2TDSPK_Tb_Cursos");
        }
    }
}
