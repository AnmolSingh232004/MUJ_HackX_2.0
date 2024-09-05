import { createWebHistory, createRouter } from "vue-router";

import AuthorisationComponent from "./components/AuthorisationComponent.vue";
import LandingPage from "./components/landingPage.vue";
import ReportingComponent from "./components/reportingComponent.vue";

const routes = [
  { path: "/", component: LandingPage },
  { path: "/authorise", component: AuthorisationComponent },
  {path: "/report", component: ReportingComponent}
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
