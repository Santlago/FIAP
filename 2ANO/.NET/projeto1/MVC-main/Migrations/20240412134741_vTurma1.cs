using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _2TDSPK.Migrations
{
    /// <inheritdoc />
    public partial class vTurma1 : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "2TDSPK_Tb_Turmas",
                columns: table => new
                {
                    TurmaId = table.Column<int>(type: "NUMBER(10)", nullable: false)
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
                    table.PrimaryKey("PK_2TDSPK_Tb_Turmas", x => x.TurmaId);
                    table.ForeignKey(
                        name: "FK_2TDSPK_Tb_Turmas_2TDSPK_Tb_Cursos_CursoId",
                        column: x => x.CursoId,
                        principalTable: "2TDSPK_Tb_Cursos",
                        principalColumn: "CursoId",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_2TDSPK_Tb_Turmas_CursoId",
                table: "2TDSPK_Tb_Turmas",
                column: "CursoId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "2TDSPK_Tb_Turmas");
        }
    }
}
