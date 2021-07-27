# PawzBackEnd

USANDO EL BASH DE GIT
--Configurar usuario de Git en el equipo--

git config --global user.name "NOMBRE"
git config --global user.email "CORREO"

--Clonar el repositorio--

git clone https://gitlab.com/TadeoMagallanes/pawz.git


--Crear una nueva rama de manera local--

git checkout -b nombrerama

--Subir la nueva rama a Git--

git push --set-upstream origin nombrerama

--Jalar cambios que se hayan hecho--

git pull --all (el all es para actualizar todas las ramas, git pull por su cuenta solo actualiza la rama en la que te encuentres)

--Crear un commit y hacer push para subir cambios a la rama--

git add . (esto agrega todos los cambios que encuentre, recomiendo usar mejor el GUI o visual)
git commit -m "comentario del commit"
git pull --all (buena práctica para evitar conflictos)
git push
