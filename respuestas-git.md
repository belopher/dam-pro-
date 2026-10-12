# Respuestas del cuestionario Git

1. **¿Qué diferencia existe entre git add y git commit?**
   `git add` prepara los cambios (los pasa al área de preparación o staging). `git commit` guarda esos cambios preparados como una nueva versión en el historial local.

2. **¿Qué hace git push? ¿Por qué puede ser rechazado?**
   `git push` envía los commits locales al repositorio remoto (GitHub). Puede rechazarse si el remoto tiene commits que mi copia local aún no tiene, porque el historial ha divergido (error non-fast-forward o fetch first). Hay que traer antes esos cambios con fetch y pull.

3. **¿En qué se diferencian git fetch y git pull?**
   `git fetch` descarga la información del remoto pero no modifica mis archivos de trabajo. `git pull` hace fetch e integra además los cambios en mi rama actual (merge).

4. **¿Qué significa origin/main?**
   Es la referencia local que apunta a la última versión conocida de la rama `main` del remoto llamado `origin`. Se actualiza con `git fetch`.

5. **¿Qué muestra git status antes y después de git add?**
   Antes, el archivo aparece como modificado o sin seguimiento (untracked) y no preparado. Después, aparece en "Cambios a ser confirmados", es decir, preparado para el commit.

6. **¿Qué información muestra git diff --cached?**
   Muestra las diferencias de los cambios ya preparados (staged), es decir, lo que se incluirá en el próximo commit.

7. **¿Para qué sirve git log --oneline HEAD..origin/main?**
   Lista, en una línea por commit, los commits que existen en el remoto y que mi rama local todavía no tiene. Sirve para ver qué traería un pull.

8. **¿Por qué conviene usar commits pequeños y descriptivos?**
   Porque facilitan entender el historial, localizar errores, revisar cambios y revertir algo concreto sin afectar al resto.

9. **¿Cómo has resuelto el push rechazado?**
   En el equipo 2 el push fue rechazado (fetch first) porque el equipo 1 había publicado antes un commit que mi copia desconocía. Ejecuté `git fetch origin` y revisé con `git log --oneline HEAD..origin/main` y `git diff HEAD origin/main` lo que faltaba. Después hice `git pull --no-rebase origin main` para integrarlo mediante merge y volví a ejecutar `git push origin main`, que esta vez funcionó. No usé `--force`.

10. **¿En qué carpeta y ventana de IntelliJ estabas cuando ocurrió el rechazo?**
    Estaba en la carpeta `~/git/dam-pro-equipo2`, en la ventana de IntelliJ del proyecto `dam-pro-equipo2` (equipo 2).