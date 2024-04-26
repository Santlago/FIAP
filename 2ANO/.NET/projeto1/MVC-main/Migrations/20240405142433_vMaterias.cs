using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _2TDSPK.Migrations
{
    /// <inheritdoc />
    public partial class vMaterias : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateIndex(
                name: "IX_2TDSPK_Tb_Materias_CursoId",
                table: "2TDSPK_Tb_Materias",
                column: "CursoId");

            migrationBuilder.AddForeignKey(
                name: "FK_2TDSPK_Tb_Materias_2TDSPK_Tb_Cursos_CursoId",
                table: "2TDSPK_Tb_Materias",
                column: "CursoId",
                principalTable: "2TDSPK_Tb_Cursos",
                principalColumn: "CursoId",
                onDelete: ReferentialAction.Cascade);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_2TDSPK_Tb_Materias_2TDSPK_Tb_Cursos_CursoId",
                table: "2TDSPK_Tb_Materias");

            migrationBuilder.DropIndex(
                name: "IX_2TDSPK_Tb_Materias_CursoId",
                table: "2TDSPK_Tb_Materias");
        }
    }
}
