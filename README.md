# Assignment 1 — Hello Kotlin. Hello Android World!

Course: Desenvolvimento de Aplicações Móveis (DAM)
Student(s): Lucas Mendes Duarte
Date: 28/02/2026
Repository URL: https://github.com/LucasDuarte2003/DAM_TP1_HelloWorld

---

## 1. Introduction

Este trabalho visa desenvolver a primeira aplicação Android. Começámos com uma ‘app’ simples "Hello World" e fomos adicionando funcionalidades progressivamente, como layouts, imagens, calendário, ícone, modo landscape e interatividade.

## 2. System Overview

O projeto é uma aplicação Android chamada "Hello World V2" que inclui:
- Dois TextViews com estilos personalizados
- Uma imagem interativa que muda ao ser clicada
- Um CalendarView
- Hora atual atualizada em tempo real
- Layout adaptado para modo portrait e landscape
- Ícone personalizado
- Logging com Logcat e modo debug com breakpoint

## 3. Architecture and Design

A aplicação segue a estrutura padrão de um projeto Android:
- `MainActivity.kt` — lógica principal da aplicação
- `activity_main.xml` — layout portrait
- `res/layout-land/activity_main.xml` — layout landscape
- `res/values/strings.xml` — ‘strings’ externalizadas
- `res/values/colors.xml` — cores da aplicação
- `res/values/themes.xml` — tema da aplicação
- `res/drawable/` — imagens utilizadas

## 4. Implementation

### Hello World v1
Foi criado um projeto Android com uma Activity simples. O texto foi externalizado para o `strings.xml` e o nome da ‘app’ foi alterado para "Hello World V1".

### Hello World v2
Foram adicionadas as seguintes funcionalidades:
- Dois TextViews estilizados no topo do ecrã
- Uma imagem que alterna entre dois ficheiros ao ser clicada
- Um CalendarView na parte inferior
- Hora atual atualizada a cada segundo usando `Handler` e `Runnable`
- Layout landscape com o coração e o calendário lado a lado
- Ícone personalizado da aplicação

### Logging e Debug (Secção 5.2)
Foi adicionado um `println` no `onCreate` da Activity usando uma ‘string’ dinâmica do `strings.xml` com placeholder `%1$s`. Foi também testado o modo debug com um breakpoint na linha do `println`.

## 5. Testing and Validation

- A app foi testada no emulador Pixel 9 Pro (API 35).
- A troca de imagem ao clicar foi testada e funciona corretamente.
- A hora atualiza corretamente a cada segundo.
- O layout landscape foi testado rodando o emulador com Ctrl+F11.
- O Logcat mostra corretamente a mensagem "Activity MainActivity onCreate".
- O modo debug pausa corretamente na linha do breakpoint.

## 6. Usage Instructions

1. Clonar o repositório: `git clone https://github.com/LucasDuarte2003/DAM_TP1_HelloWorld.git`
2. Abrir o projeto no Android Studio
3. Correr a ‘app’ num emulador ou dispositivo físico com API 24, ou superior

---

*As secções 7 a 11 não se aplicam a este repositório, pois nenhum exercício era [AC OK, AI OK].*

# Development Process

## 12. Version Control and Commit History

O Git foi usado ao longo do projeto. Foram feitos 3 commits ao repositório:
- **Commit 1:** Setup inicial do projeto com a estrutura base.
- **Commit 2:** Adição do logging com Logcat e teste do modo debug com breakpoint.
- **Commit 3:** Adição da troca de imagem ao clicar e da hora em tempo real.

Reconheço que poderiam ter sido feitos mais commits intermédios, por exemplo, separando o Hello World v1 do v2, mas esta foi a progressão real do trabalho.

## 13. Difficulties and Lessons Learned

- Para mostrar o nome da ‘app’ na barra de topo foi necessário remover o `NoActionBar` do tema em `themes.xml`. Por defeito o Android Studio gera o projeto com um tema sem ActionBar, o que faz com que o nome da ‘app’ não apareça.
- Para layouts dinâmicos que funcionem bem em diferentes tamanhos de ecrã, o `LinearLayout` com `layout_weight` é mais adequado do que o `ConstraintLayout`.
- O `Timer` e `TimerTask` estão deprecated no Android. A alternativa correta é usar `Handler` com `Runnable`.
- Foi necessário mudar para um PC mais potente porque o meu portátil não tinha capacidade suficiente para correr o simulador Android.

## 14. Future Improvements

- Adicionar mais imagens para tornar a galeria mais interessante.
- Melhorar o layout landscape para tirar melhor partido do espaço horizontal.
- Adicionar animações na troca de imagens.

---

## 15. AI Usage Disclosure (Mandatory)

- **Ferramenta de IA utilizada:** Claude (claude.ai)
- **Como foi utilizada:** Exclusivamente para esclarecer dúvidas sobre conceitos Android e ajudar na realização deste relatório. Nas secções [AC YES, AI NO] foi utilizado o autocomplete do Android Studio.
- **Outras ferramentas:** Foi utilizada a ferramenta de correção gramatical integrada no Android Studio para rever e corrigir o relatório.
- **Responsabilidade:** Eu, Lucas Mendes Duarte (n.º 50735), sou totalmente responsável por todo o conteúdo submetido.