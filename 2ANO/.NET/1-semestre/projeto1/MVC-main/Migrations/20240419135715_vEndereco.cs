using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _2TDSPK.Migrations
{
    /// <inheritdoc />
    public partial class vEndereco : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "EnderecoId",
                table: "2TDSPK_Tb_Alunos",
                type: "NUMBER(10)",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateTable(
                name: "2TDSPK_Tb_Enderecos",
                columns: table => new
                {
                    EnderecoId = table.Column<int>(type: "NUMBER(10)", nullable: false)
                        .Annotation("Oracle:Identity", "START WITH 1 INCREMENT BY 1"),
                    CEP = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    Logradouro = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    Bairro = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false),
                    Numero = table.Column<int>(type: "NUMBER(10)", nullable: false),
                    Complemento = table.Column<string>(type: "NVARCHAR2(2000)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_2TDSPK_Tb_Enderecos", x => x.EnderecoId);
                });

            migrationBuilder.CreateTable(
                name: "AlunoCurso",
                columns: table => new
                {
                    AlunosAlunoId = table.Column<int>(type: "NUMBER(10)", nullable: false),
                    CursosCursoId = table.Column<int>(type: "NUMBER(10)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_AlunoCurso", x => new { x.AlunosAlunoId, x.CursosCursoId });
                    table.ForeignKey(
                        name: "FK_AlunoCurso_2TDSPK_Tb_Alunos_AlunosAlunoId",
                        column: x => x.AlunosAlunoId,
                        principalTable: "2TDSPK_Tb_Alunos",
                        principalColumn: "AlunoId",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_AlunoCurso_2TDSPK_Tb_Cursos_CursosCursoId",
                        column: x => x.CursosCursoId,
                        principalTable: "2TDSPK_Tb_Cursos",
                        principalColumn: "CursoId",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_2TDSPK_Tb_Alunos_EnderecoId",
                table: "2TDSPK_Tb_Alunos",
                column: "EnderecoId");

            migrationBuilder.CreateIndex(
                name: "IX_AlunoCurso_CursosCursoId",
                table: "AlunoCurso",
                column: "CursosCursoId");

            migrationBuilder.AddForeignKey(
                name: "FK_2TDSPK_Tb_Alunos_2TDSPK_Tb_Enderecos_EnderecoId",
                table: "2TDSPK_Tb_Alunos",
                column: "EnderecoId",
                principalTable: "2TDSPK_Tb_Enderecos",
                principalColumn: "EnderecoId",
                onDelete: ReferentialAction.Cascade);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_2TDSPK_Tb_Alunos_2TDSPK_Tb_Enderecos_EnderecoId",
                table: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropTable(
                name: "2TDSPK_Tb_Enderecos");

            migrationBuilder.DropTable(
                name: "AlunoCurso");

            migrationBuilder.DropIndex(
                name: "IX_2TDSPK_Tb_Alunos_EnderecoId",
                table: "2TDSPK_Tb_Alunos");

            migrationBuilder.DropColumn(
                name: "EnderecoId",
                table: "2TDSPK_Tb_Alunos");
        }
    }
}
