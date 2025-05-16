# PROG-5-USSD

Ce projet est une application Java développée sans framework de dépendances comme Maven ou Gradle au départ, puis convertie pour utiliser Maven afin de bénéficier d’un linter et d’une intégration continue (CI).

## ✨ Fonctionnalités

- Développement en Java standard
- Suivi des conventions de nommage en `camelCase`
- Analyse de style avec **Checkstyle**
- Intégration continue via **GitHub Actions**

---

## 🧹 Linter : Checkstyle

Le projet utilise [Checkstyle](https://checkstyle.sourceforge.io/) pour garantir la qualité et la cohérence du code Java.

### 🔧 Configuration

- Fichier de configuration utilisé : `google_checks.xml` (ou un fichier personnalisé si tu en utilises un)
- Conventions principales : indentation, espaces, nommage en `camelCase`, documentation, etc.

### 🏃‍♂️ Lancer Checkstyle

```bash
mvn checkstyle:check
